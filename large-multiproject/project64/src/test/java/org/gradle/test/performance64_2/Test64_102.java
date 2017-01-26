package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_102 {
    private final Production64_102 production = new Production64_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}