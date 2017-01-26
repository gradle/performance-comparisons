package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_268 {
    private final Production11_268 production = new Production11_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}