package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_10 {
    private final Production64_10 production = new Production64_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}