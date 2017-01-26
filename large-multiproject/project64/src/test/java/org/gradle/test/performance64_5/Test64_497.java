package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_497 {
    private final Production64_497 production = new Production64_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}