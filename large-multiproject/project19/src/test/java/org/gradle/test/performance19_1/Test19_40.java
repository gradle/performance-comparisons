package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_40 {
    private final Production19_40 production = new Production19_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}