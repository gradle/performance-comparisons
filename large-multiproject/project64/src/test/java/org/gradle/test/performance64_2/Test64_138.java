package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_138 {
    private final Production64_138 production = new Production64_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}