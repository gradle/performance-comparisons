package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_466 {
    private final Production64_466 production = new Production64_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}