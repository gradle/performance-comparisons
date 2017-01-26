package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_28 {
    private final Production64_28 production = new Production64_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}