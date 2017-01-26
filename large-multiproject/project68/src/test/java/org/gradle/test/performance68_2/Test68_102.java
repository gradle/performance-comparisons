package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_102 {
    private final Production68_102 production = new Production68_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}