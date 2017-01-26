package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_234 {
    private final Production51_234 production = new Production51_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}