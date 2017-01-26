package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_102 {
    private final Production85_102 production = new Production85_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}