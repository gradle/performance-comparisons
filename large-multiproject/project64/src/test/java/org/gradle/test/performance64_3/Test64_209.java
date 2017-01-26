package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_209 {
    private final Production64_209 production = new Production64_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}