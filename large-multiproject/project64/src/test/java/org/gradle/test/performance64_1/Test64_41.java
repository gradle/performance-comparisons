package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_41 {
    private final Production64_41 production = new Production64_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}