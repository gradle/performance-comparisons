package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_437 {
    private final Production11_437 production = new Production11_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}