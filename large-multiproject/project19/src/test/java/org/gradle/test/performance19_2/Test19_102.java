package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_102 {
    private final Production19_102 production = new Production19_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}