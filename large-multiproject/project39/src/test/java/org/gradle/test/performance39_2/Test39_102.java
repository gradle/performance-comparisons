package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_102 {
    private final Production39_102 production = new Production39_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}