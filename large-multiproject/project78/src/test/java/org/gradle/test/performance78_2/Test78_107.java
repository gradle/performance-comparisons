package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_107 {
    private final Production78_107 production = new Production78_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}