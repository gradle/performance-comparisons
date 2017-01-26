package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_107 {
    private final Production64_107 production = new Production64_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}