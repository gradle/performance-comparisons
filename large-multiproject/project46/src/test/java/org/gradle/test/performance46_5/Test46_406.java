package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_406 {
    private final Production46_406 production = new Production46_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}