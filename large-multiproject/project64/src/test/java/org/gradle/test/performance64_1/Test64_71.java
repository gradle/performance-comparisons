package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_71 {
    private final Production64_71 production = new Production64_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}