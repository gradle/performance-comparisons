package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_26 {
    private final Production64_26 production = new Production64_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}