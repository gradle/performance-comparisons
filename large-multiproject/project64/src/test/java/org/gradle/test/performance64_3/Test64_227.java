package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_227 {
    private final Production64_227 production = new Production64_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}