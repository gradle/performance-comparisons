package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_199 {
    private final Production64_199 production = new Production64_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}