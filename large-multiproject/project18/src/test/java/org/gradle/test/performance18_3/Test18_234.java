package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_234 {
    private final Production18_234 production = new Production18_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}