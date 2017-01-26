package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_93 {
    private final Production19_93 production = new Production19_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}