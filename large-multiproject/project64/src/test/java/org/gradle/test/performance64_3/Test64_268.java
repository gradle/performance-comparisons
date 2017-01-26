package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_268 {
    private final Production64_268 production = new Production64_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}