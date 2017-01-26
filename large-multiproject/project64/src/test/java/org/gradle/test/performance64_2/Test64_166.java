package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_166 {
    private final Production64_166 production = new Production64_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}