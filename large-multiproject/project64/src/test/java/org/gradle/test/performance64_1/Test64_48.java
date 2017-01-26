package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_48 {
    private final Production64_48 production = new Production64_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}