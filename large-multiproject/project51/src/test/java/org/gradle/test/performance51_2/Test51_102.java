package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_102 {
    private final Production51_102 production = new Production51_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}