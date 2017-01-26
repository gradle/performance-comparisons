package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_282 {
    private final Production46_282 production = new Production46_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}