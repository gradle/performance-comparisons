package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_88 {
    private final Production19_88 production = new Production19_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}