package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_437 {
    private final Production94_437 production = new Production94_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}