package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_234 {
    private final Production73_234 production = new Production73_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}