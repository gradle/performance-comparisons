package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_234 {
    private final Production1_234 production = new Production1_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}