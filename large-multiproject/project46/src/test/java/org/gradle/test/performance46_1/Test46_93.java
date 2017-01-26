package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_93 {
    private final Production46_93 production = new Production46_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}