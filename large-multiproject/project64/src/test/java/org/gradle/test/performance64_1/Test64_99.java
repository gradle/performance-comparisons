package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_99 {
    private final Production64_99 production = new Production64_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}