package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_98 {
    private final Production52_98 production = new Production52_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}