package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_246 {
    private final Production64_246 production = new Production64_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}