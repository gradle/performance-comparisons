package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_255 {
    private final Production94_255 production = new Production94_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}