package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_331 {
    private final Production52_331 production = new Production52_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}