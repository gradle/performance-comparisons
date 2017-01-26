package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_234 {
    private final Production45_234 production = new Production45_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}