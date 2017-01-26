package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_315 {
    private final Production11_315 production = new Production11_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}