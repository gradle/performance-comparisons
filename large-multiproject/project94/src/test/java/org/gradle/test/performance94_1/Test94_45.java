package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_45 {
    private final Production94_45 production = new Production94_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}