package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_255 {
    private final Production46_255 production = new Production46_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}