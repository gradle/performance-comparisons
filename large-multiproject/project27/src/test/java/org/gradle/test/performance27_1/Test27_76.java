package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_76 {
    private final Production27_76 production = new Production27_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}