package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_255 {
    private final Production51_255 production = new Production51_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}