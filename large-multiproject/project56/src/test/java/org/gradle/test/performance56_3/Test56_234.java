package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_234 {
    private final Production56_234 production = new Production56_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}