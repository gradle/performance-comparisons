package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_207 {
    private final Production46_207 production = new Production46_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}