package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_45 {
    private final Production52_45 production = new Production52_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}