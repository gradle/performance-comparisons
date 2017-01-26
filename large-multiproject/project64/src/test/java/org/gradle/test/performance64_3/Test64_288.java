package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_288 {
    private final Production64_288 production = new Production64_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}