package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_500 {
    private final Production64_500 production = new Production64_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}