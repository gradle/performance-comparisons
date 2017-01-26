package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_234 {
    private final Production44_234 production = new Production44_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}