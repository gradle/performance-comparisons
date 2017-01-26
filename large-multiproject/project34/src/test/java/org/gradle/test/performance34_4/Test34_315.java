package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_315 {
    private final Production34_315 production = new Production34_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}