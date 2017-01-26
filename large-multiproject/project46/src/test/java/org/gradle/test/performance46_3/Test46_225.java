package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_225 {
    private final Production46_225 production = new Production46_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}