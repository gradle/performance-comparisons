package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_353 {
    private final Production51_353 production = new Production51_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}