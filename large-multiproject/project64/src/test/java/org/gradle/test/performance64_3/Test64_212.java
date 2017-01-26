package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_212 {
    private final Production64_212 production = new Production64_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}