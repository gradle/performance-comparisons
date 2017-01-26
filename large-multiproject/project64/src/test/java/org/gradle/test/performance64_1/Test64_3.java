package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_3 {
    private final Production64_3 production = new Production64_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}