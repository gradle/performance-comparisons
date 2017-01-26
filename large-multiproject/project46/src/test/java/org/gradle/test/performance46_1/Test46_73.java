package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_73 {
    private final Production46_73 production = new Production46_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}